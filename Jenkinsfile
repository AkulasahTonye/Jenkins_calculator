pipeline {
 agent any
 stages {
    stage("Checkout") {
        steps {
          git url: 'https://github.com/AkulasahTonye/Jenkins_calculator.git', branch: 'main'
        }
    }
    stage("Compile") {
         steps {
         sh "./gradlew compileJava"
            }
}
stage("Unit test"){
    steps{
        sh "./gradlew compileJava"
    }
}
 }
}