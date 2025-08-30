#!/usr/bin/env groovy
library identifier: 'Jenkins-shared-library@main', retriever: modernSCM(
    [$class: 'GitSCMSource',
     remote: 'http://www.gitea.com/Admin/jenkins-shared-library.git'
     credentialsId: 'Gitea_Credentials'
    ]
)
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
                    buildJar()
                }
            }
        }
        stage("build image") {
            steps {
                script {
                    buildImage 'java-maven-app:5.0'
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    dockerLogin()
                    dockerPush 'java-maven-app:5.0'
                }
            }
        }
    }   
}