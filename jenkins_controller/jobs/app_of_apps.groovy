pipelineJob('app_of_apps') {
    parameters {
        stringParam('backendDockerTag', '', 'Backend docker image tag')
        stringParam('frontendDockerTag', '', 'Frontend docker image tag')
    }
 
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/1wonderwonder/App_of_apps.git")
                    }
                    branches('main')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}