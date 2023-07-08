def call(String project,String imagetag, String dockerHubUser){
    withCredentials([usernamePassword(credentialsId: 'dockerhub',
                                      passwordVariable: 'PASS', 
                                      usernameVariable: 'USER')]) {
    sh "docker login -u '$USER' -p '$PASS'"
}
sh """
docker image push ${dockerHubUser}/${project}:${imagetag}
docker image push ${dockerHubUser}/${project}:latest
"""
}