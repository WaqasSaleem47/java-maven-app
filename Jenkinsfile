pipeline {
    agent any
    environment {
        APP_VERSION = '1.3.0'
    }
    stages {
        stage('build') {
            steps {
                    echo "Building the application..."
                    echo "Building version ${APP_VERSION}"
                    withCredentials([usernamePassword(credentialsId: 'Dockerhub-Credentials', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                        echo "Docker Hub username: ${DOCKER_USER}"
                        echo "Docker Hub password: ${DOCKER_PASS}"
                    }
            }
        }
        stage('test') {
            steps {
                    echo "Testing the application..."
            }
        }
        stage('deploy') {
            steps {
                    echo "Deploying the application..."
            }
        }       
    }
}
