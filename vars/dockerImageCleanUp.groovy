/* def call(String project,String imagetag, String dockerHubUser){
    sh """
    docker rmi ${dockerHubUser}/${project}:${imagetag}
    docker rmi ${dockerHubUser}/${project}:latest
    """
} */

 def call(String aws_account_id,String region,String repoName){
    
    sh """
    docker rmi ${repoName}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${repoName}:latest
    """
}