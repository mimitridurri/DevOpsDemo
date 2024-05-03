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
                        echo 'Checking out the code...'
                        checkout scm
                    } catch (Exception e) {
                        echo "Checkout failed: ${e}"
                        error "Stopping build."
                    }
                }
            }
        }
        
        stage('Test') {
            steps {
                script {
                    try {
                        echo 'Running tests...'
                        // Add your testing commands here
                    } catch (Exception e) {
                        echo "Test failed: ${e}"
                        currentBuild.result = 'UNSTABLE'
                    }
                }
                echo 'Tests completed.'
                echo "Changes detected on branch: ${GIT_COMMIT}"
            }
        }
        
        stage('Deploy') {
            when {
                branch 'main'
            }
            steps {
                script {
                    try {
                        echo "Deploying to ${env.DEPLOYMENT_ENV}..."
                        // Add your deploy commands here
                    } catch (Exception e) {
                        echo "Deploy failed: ${e}"
                        error "Stopping build."
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
