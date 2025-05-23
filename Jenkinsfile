def gv

pipeline {
    agent any
    tools {
        maven 'MAVEN'
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
                    gv.buildImage()
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }   
}
