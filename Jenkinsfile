pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                sh 'echo checkout'
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/mimitridurri/DevOpsDemo']])
            }
        }
        stage('Test') {
            steps {
                sh 'echo test'
                sh 'Changes I made on GitHub'
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo deploy'
            }
        }
    }
}
