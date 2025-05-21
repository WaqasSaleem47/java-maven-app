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
            }
        }
        stage('deploy') {
            steps {
                    echo "Deploying the application..."
            }
        }       
    }
}
