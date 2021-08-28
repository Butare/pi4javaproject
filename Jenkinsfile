pipeline {
  agent any
  stages {
    stage('stage1') {
      steps {
        echo 'This is build number $BUILD_NUMBER of stage $DEMO'
      }
    }

  }
  environment {
    DEMO = '1'
  }
}