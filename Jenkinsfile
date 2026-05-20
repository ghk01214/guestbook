pipeline
{
	agent any

	stages
	{
		stage('Checkout')
		{
			steps
			{
				// Get some code from a GitHub repository
				git (branch: 'master', url:'https://github.com/yu3papa/guestbook.git')
			}
		}
		stage('Build')
		{
			agent
			{
				docker
				{
					image 'maven:3.8.4-openjdk-11-slim'
				}
			}

			steps
			{
				sh "mvn -Dmaven.test.failure.ignore=true clean package"
			}
		}
	}
}
