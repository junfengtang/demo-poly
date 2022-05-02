# docker安装软件

## 安装mongo

```shell
docker run -itd --name mongo -p 27017:27017 mongo --auth

进入docker
docker exec -it mongo mongo admin

创建一个名为 admin，密码为 123456 的用户。
db.createUser({ user:'admin',pwd:'123456',roles:[ { role:'userAdminAnyDatabase', db: 'admin'},"readWriteAnyDatabase"]});
```



