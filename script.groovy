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
    withCredentials([usernamePassword(credentialsId: 'dockerhub-Credentials', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t waqassaleem/java-maven-app:jma-4.0 .'
        sh 'docker tag waqassaleem/java-maven-app:jma-4.0 localhost:90/java-maven-app:jma-4.0'
        
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push waqassaleem/java-maven-app:jma-4.0'
        sh 'docker push localhost:90/java-maven-app:jma-4.0'
    }
} 

def deployApp() {
    echo 'deploying the application...'
} 

return this
