def runTest() {
    echo "testing the application..."
    sh 'mvn test'
}

def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'dockerHub-credentials', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t waqassaleem/java-maven-app:3.0 .'
        sh 'docker tag localhost:90/java-maven-app:3.0 waqassaleem/java-maven-app:3.0'
        
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push waqassaleem/java-maven-app:3.0'
        sh 'docker push localhost:90/java-maven-app:3.0'
    }
} 

def deployApp() {
    echo 'deploying the application...'
} 

return this
