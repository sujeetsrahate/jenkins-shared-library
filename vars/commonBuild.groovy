def call() {
  stage('Checkout') {
    echo 'Cloning Git repository manually...'
    sh 'git clone https://github.com/sujeetsrahate/jenkins-shared-library'
    dir('source-code') {
      echo 'Repository cloned into source-code/'
    }
  }

  stage('Unit Tests') {
    dir('source-code') {
      echo 'Running unit tests...'
      sh './gradlew test'
    }
  }
}
