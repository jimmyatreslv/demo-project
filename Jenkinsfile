pipeline {
  agent {
    docker {
      image 'gradle'
    }

  }
  stages {
    stage('Test') {
      parallel {
        stage('Test Gradle') {
          steps {
            sh 'gradle -version'
          }
        }

        stage('Test Java') {
          steps {
            sh 'java -version'
          }
        }

        stage('Test others') {
          steps {
            sh '''which java
which gradle
which maven
which mvn'''
          }
        }

      }
    }

  }
}