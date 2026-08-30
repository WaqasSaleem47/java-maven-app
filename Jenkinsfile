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
          env.BRANCH_NAME != 'dev'
        }
      }
      steps { echo 'testing the application...' }
    }
    stage('Deploy') {
    steps {
      withCredentials([usernamePassword(
          credentialsId: 'server-credentials',
          usernameVariable: 'USER',
          passwordVariable: 'PWD')]) {
      echo  "$USER $PWD"
  }
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
