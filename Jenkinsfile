pipeline {
    agent any

    environment {
        DEPLOYMENT_ENV = 'staging'
        REPO_URL = 'https://github.com/mimitridurri/DevOpsDemo'
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    try {
                        sh 'echo Checking out the code...'
                        checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: env.REPO_URL]])
                    } catch (Exception e) {
                        echo "Checkout failed: ${e}"
                        currentBuild.result = 'FAILURE'
                        error "Stopping build."
                    }
                }
            }
        }
        
        stage('Test') {
            steps {
                script {
                    try {
                        sh 'echo Running tests...'
                        // Add your testing commands here
                    } catch (Exception e) {
                        echo "Test failed: ${e}"
                        currentBuild.result = 'UNSTABLE'
                    }
                }
                echo 'Tests completed.'
                echo "Changes detected on branch: \${GIT_COMMIT}" // Uses Jenkins environment variable
            }
        }
        
        stage('Deploy') {
            when {
                branch 'main'
            }
            steps {
                script {
                    try {
                        sh "echo Deploying to ${env.DEPLOYMENT_ENV}..."
                        // Add your deploy commands here
                    } catch (Exception e) {
                        echo "Deploy failed: ${e}"
                        currentBuild.result = 'FAILURE'
                    }
                }
            }
        }
    }

    post {
        always {
            echo 'Pipeline completed.'
        }
        success {
            echo 'Pipeline succeeded.'
            // Add success actions here
        }
        failure {
            echo 'Pipeline failed.'
            // Add failure actions here
        }
    }
}
