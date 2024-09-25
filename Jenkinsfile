// SCRIPTED PIPELINE 

//node {
//	stage('Build') {
//		echo "Build"
//	}
//	stage('Test') {
//		echo "Test"
//	}
//	stage('Integration Test') {
//		echo "Integration Test"
//	}
//}

// DECLARATIVE PIPELINE
pipeline {
//	agent { docker { image 'node:latest' } }
//	agent { docker { image 'maven:3.6.3' } }
	agent any
	environment{
		dockerHome = tool 'my-docker'
		mavenHome = tool 'my-maven'
		PATH = "$dockerHome/bin:$mavenHome/bin:$PATH"
	}
	stages {
		stage ('Checkout'){
			steps {
				sh 'docker --version'
				sh 'mvn --version'
				echo "Build"
				echo "PATH - $PATH"
				echo "BUILD_NUMBER - $env.BUILD_NUMBER"
				echo "BUILD_ID - $env.BUILD_ID"
				echo "BUILD_URL - $env.BUILD_URL"
				echo "BUILD_TAG - $env.BUILD_TAG"
				echo "JOB_NAME - $env.JOB_NAME"
			}
		}
		stage ('Compile'){
			steps {	
				sh "mvn clean compile"
			}
		}
		stage ('Test'){
			steps {
				echo "Test"
				sh "mvn test"
			}
		}
		stage ('Integration Test'){
			steps {
				echo "Integration Test"
				sh "mvn failsafe:integration-test failsafe:verify"
			}
		}
	}
	post {
		always {
			echo "This message shows you in every run."
		}
		success {
			echo "All steps have finished successfuly."
		}
		failure {
			echo "There is something wrong."
		}
	}
}