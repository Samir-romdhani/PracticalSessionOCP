pipeline {
    agent any

    environment {
        CI = 'true'
    }
    stages {

        stage('Test') {
            when {
                branch 'test'
            }
            steps {
                sh "echo 'shell scripts to build project..'"
            }
        }


}

