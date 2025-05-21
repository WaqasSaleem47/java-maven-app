pipeline {
    agent any
    stages {
        stage('build') {
            when {
                expression {
                    env.BUILD_NUMBER.toInteger() % 2 == 0
                }
            }
            steps {
                    echo "Building the application..."
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
