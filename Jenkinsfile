def gv

pipeline {
    agent any
    tools {
    maven 'Maven'
    }
    stages {
        stage("init") {
            steps {
                script {
//                    gv = load "script.groovy"
                    echo "Initializing the file"
                }
            }
        }
        stage("run test") {
            steps {
                script {
//                    gv.runTest()
                    echo "Run test"
                }
            }
        }
        stage("build jar") {
            steps {
                script {
//                    gv.buildJar()
                    echo "Building the jar"
                }
            }
        }
        stage("build image") {
            steps {
                script {
//                    gv.buildImage()
                    echo "Building the image"
                }
            }
        }
        stage("deploy") {
            steps {
                script {
//                    gv.deployApp()
                    echo "Deploying the image"
                }
            }
        }
    }   
}
