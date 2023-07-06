def call(String project,String imagetag, String dockerHubUser){
    sh """
    trivy image ${dockerHubUser}/${project}:latest > scan.txt
    cat scan.txt
    """
}