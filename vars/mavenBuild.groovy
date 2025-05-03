def call(String goals = 'clean install') {
    echo "Running Maven goals: ${goals}"
    sh "mvn ${goals}"
}
