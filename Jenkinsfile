pipeline {
  agent any
    environment {
    NEW_VERSION = '1.3.0'
    SERVER_CREDENTIALS =
    credentials('NEXUS_PASSWORD')
  }
  stages {
    stage('Build') {
      steps { 
        echo 'building the application...' 
        echo "version: ${NEW_VERSION}"
      }
    }
    stage('Test') {
      when {
        expression {
          env.BRANCH_NAME == 'dev'
        }
      }
      steps { echo 'testing the application...' }
    }
    stage('Deploy') {
      steps { 
        echo 'deploying the application...'
        sh "deploy --user ${SERVER_CREDENTIALS_USR}"
        sh "deploy --password ${SERVER_CREDENTIALS_PSW}"
      }
    }
  }
  post {
    always  { 
      echo 'This always runs'
    }
    success {
      echo 'The pipeline succeeded'
    }
    failure {
      echo 'The pipeline failed'
    }
  }
}
