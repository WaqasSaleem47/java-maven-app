pipeline {
    agent any
    parameters {
        string(name: 'APP_ENV', defaultValue: '1.1.0', description: 'Version to display on prod (e.g., 1.1.0, 1.2.0, 1.3.0)')
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: 'Select the deployment Version')
        booleanParam(name: 'EXEC_TESTS', defaultValue: true, description: 'Do you want to run tests?')
    }
    stages {
        stage('build') {
            steps {
                    echo "Building the application..."
                    echo "Version ${params.VERSION}"
            }
        }
        stage('test') {
            when {
                expression {
                    params.EXEC_TESTS
                }
            }
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
