# demo project

-   build and update image

`./mvnw package k8s:build k8s:push`

-   generate k8s resource and deploy

`./mvnw k8s:resource k8s:deploy`

-   check app in k8s

`kubectl get all -n dev -l app=demo-project`

-   test app in k8s

`curl -i service_ip:8080; echo`

`curl -i service_ip:8080/greeting; echo`

-   undeploy

`./mvnw k8s:undeploy`
