# graphql

Graphql code run on 8082
Ratting run on 8081 need solr 8983


my-ratting-app-image that run on 8081 and dependent on image name solr-compile-code-app and run on 8983

Now there is 3 image name my-graphql-code-app-image that run on 8082 and dependent for my-ratting-app-image


Can you let me know how can i run this with docker compose 


docker pull ravi88881/my-ratting-app-image:latest
use 8081
docker pull ravi8881/solr-compile-code-app-image:latest
use 8983
docker pull ravi8881/my-graphql-code-app-image:latest
use 8082
