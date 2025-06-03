pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage('build') {
            steps {
                    echo "Building the application..."
                    sh "mvn --version"
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
