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
				git branch: 'master', url:'https://github.com/yu3papa/guestbook.git'
			}
		}
		stage('Build')
		{
			steps
			{
				sh './mvnw clean compile'
			}
		}
		stage('UnitTest')
		{
			steps
			{
				sh './mvnw test;'
			}

			post
			{
				always
				{
					junit '**/target/surefire-reports/TEST-*.xml'
				}
			}
		}
	}
}
