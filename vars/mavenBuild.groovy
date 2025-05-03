def call(String goals = 'clean install') {
    stage('Maven Build') {
        echo "Running Maven with goals: ${goals}"
        sh "mvn ${goals}"
    }
}
