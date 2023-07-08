/* def call(String project,String imagetag, String dockerHubUser){
    sh """
    trivy image ${dockerHubUser}/${project}:latest > scan.txt
    cat scan.txt
    """
} */

def call(String aws_account_id,String region,String repoName){
    
    sh """
    trivy image ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${repoName}:latest > scan.txt
    cat scan.txt
    """
}