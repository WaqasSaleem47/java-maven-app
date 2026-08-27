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
                    gv = load "script.groovy"
                }
            }
        }
        stage("run test") {
            steps {
                script {
                    gv.runTest()
                }
            }
        }
        stage("build jar") {
            steps {
                script {
                    gv.buildJar()
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
