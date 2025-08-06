def gv
pipeline {
    agent any
    stages {
        stage("run test") {
            steps {
                script {
                    echo "Testing the application"
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
                    echo "Building the docker image"
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    echo "Deploying the docker image"
                }
            }
        }
    }   
}
