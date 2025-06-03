pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo "Building the application..."
            }
        }
        stage('test') {
            steps {
                echo "Testing the application..."
                error("Forcing failure in test stage") // Triggers failure
            }
        }
        stage('deploy') {
            steps {
                echo "Deploying the application..."
            }
        }       
    }
    post {
        always {
            echo "Always block"
        }
        failure {
            echo "failure block"
        }
        success {
            echo "Success block"
        }
    }
}
