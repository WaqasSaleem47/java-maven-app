pipeline {
    agent any
    environment {
        APP_VERSION = '1.3.0'
        Dockerhub_Credentials = credentials('Dockerhub-Credentials')
    }
    stages {
        stage('build') {
            steps {
                    echo "Building the application..."
                    echo "Building version ${APP_VERSION}"
                    echo "Docker Hub credentials ${Dockerhub_Credentials_USR}"
                    echo "Docker Hub credentials ${Dockerhub_Credentials_PSW}"
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
