pipeline {
  agent any

    tools {
    maven 'maven-3.9'
  }
    environment {
    NEW_VERSION = '1.3.0'
  }
  parameters {
  string(
    name: 'VERSION',
    defaultValue: '',
    description: 'version to deploy'
  )
  choice(
    name: 'ENVIRONMENT',
    choices: ['dev', 'staging', 'prod']
  )
  booleanParam(
    name: 'executeTests',
    defaultValue: true
  )
}

  stages {
    stage('Build') {
      steps { 
        echo 'building the application...' 
        echo "version: ${NEW_VERSION}"
        sh 'mvn package'
      }
    }
    stage('Test') {
      when {
        expression {
          params.executeTests
        }
      }
      steps { echo 'testing the application...' }
    }
    stage('Deploy') {
    steps {
      withCredentials([usernamePassword(
          credentialsId: 'NEXUS_PASSWORD',
          usernameVariable: 'USER',
          passwordVariable: 'PWD')]) {
      echo  "$USER $PWD"
      echo "Deploying version ${params.VERSION}"
      echo "Target: ${params.ENVIRONMENT}"

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
