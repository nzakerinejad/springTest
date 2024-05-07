- Using java=21.0.3-tem


### You can launch postres with:
docker run  -e POSTGRES_PASSWORD=mysecretpassword -it -p 5432:5432 postgres


### next job: postgres on kind cluster (create 2 yml file, one for ui the other is for database; 
### load; portforward)

# kubernetes setup with kind
1. kind create cluster.
2. Create nginx podName.yml -> like demo.yml
3. kubectl apply -f pod.yaml -> kubectl apply -f demo.yaml
### Viewing Your Pods
- kubectl get pods.
- kubectl describe pod

### Run postgres docker image
docker run  -e POSTGRES_PASSWORD=mysecretpassword -it -p 5432:5432 postgres
### Run a simple pgAdmin container over port 80:
docker pull dpage/pgadmin4
docker run -p 80:80 \
-e 'PGADMIN_DEFAULT_EMAIL=user@domain.com' \
-e 'PGADMIN_DEFAULT_PASSWORD=SuperSecret' \
-d dpage/pgadmin4

### Create a network between containers pgAdmin and postgres

- docker network create my-network
- docker network connect my-network server-a
- docker network connect my-network server-b

#### In our example:- >    > 
-  docker ps
- docker network connect hassan boring_montalcini
- docker network connect hassan zealous_saha

## To Do:


use DBeaver to connect to postgres running on docker
connect to postgres from java