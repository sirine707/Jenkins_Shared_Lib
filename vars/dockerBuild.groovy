def call(String project,String imagetag, String dockerHubUser){
    sh """
    docker build -t ${dockerHubUser}/${project}
    docker image tag ${dockerHubUser}/${project} ${dockerHubUser}/${project}:${imagetag}
    docker image tag ${dockerHubUser}/${project} ${dockerHubUser}/${project}:latest
    """
}