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
			steps
			{
				sh "./mvnw -Dmaven.test.failure.ignore=true clean package"
			}

			post
			{
				success
				{
					archiveArtifacts 'target/*.jar'
				}
			}
		}
	}
}
