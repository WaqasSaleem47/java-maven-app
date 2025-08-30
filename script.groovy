def runTest() {
    echo "testing the application..."
    sh 'mvn test'
}

def deployApp() {
    echo 'deploying the application...'
    withCredentials([usernamePassword(credentialsId: 'dockerHub-credentials', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push waqassaleem/java-maven-app:4.0'
        sh 'docker push localhost:90/java-maven-app:4.0'
    }
} 

return this

