pipeline {
    agent any
    stages {
        stage('build') {
            when {
                expression {
                    env.BRANCH_NAME == 'jenkins-jobs'
                }
            }
            steps {
                    echo "Building the application..."
            }
        }
        stage('test') {
            steps {
                    echo "Testing the application..."
                    echo "BRANCH_NAME is: ${env.BRANCH_NAME}"
            }
        }
        stage('deploy') {
            steps {
                    echo "Deploying the application..."
            }
        }       
    }
}
