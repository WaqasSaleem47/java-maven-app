def gv
pipeline {
    agent any
    stages {
        stage("run test") {
            steps {
                script {
                    echo "Testing the application“
	         echo "Executing pipeline for $BRANCH_NAME"
                }
            }
        }
        stage("build jar") {
            when {
                expression {
                    BRANCH_NAME == 'main'
                }
            }
            steps {
                script {
                    echo "Building the jar file"
                }
            }
        }
        stage("build image") {
            steps {
                script {
                    echo "Building the Docker image"
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    echo "Deploying the Docker image"
                }
            }
        }
    }   
}
