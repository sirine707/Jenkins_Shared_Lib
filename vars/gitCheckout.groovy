def call(map stageParams){
    checkout(
        [$class: 'GitSCM',
        branches: [[name: stageParams.branch]],
        userRemoteCongigs=[[url:stageParams.url]]

        ]
    )
}