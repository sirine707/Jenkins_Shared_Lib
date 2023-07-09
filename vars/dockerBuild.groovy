/* def call(String project,String imagetag, String dockerHubUser){
    sh """
    docker image build -t ${dockerHubUser}/${project} .
    docker image tag ${dockerHubUser}/${project} ${dockerHubUser}/${project}:${imagetag}
    docker image tag ${dockerHubUser}/${project} ${dockerHubUser}/${project}:latest
    """
} */
def call(String aws_account_id,String region,String ecr_repoName){
    sh """
     docker build -t ${ecr_repoName} .
     docker tag ${ecr_repoName}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
    """
}
