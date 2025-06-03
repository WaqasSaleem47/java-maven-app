def buildApp(){
  echo "App ${params.APP_ENV}..."
  echo "Building the application..."
  echo "Version ${params.VERSION}"
}

def testApp(){
  echo "Testing the application..."
}

def deployApp(){
  echo "Deploying the application..."
}
return this

