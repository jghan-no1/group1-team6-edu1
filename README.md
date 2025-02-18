=====================================================================================
1일차 교육

kubernets
    -- namespace
    kubectl create namespace group1-team6
    ==> 확인 kubectl get ns

    -- yaml 파일 추가 삭제
    kubectl apply -f test.yaml
    kubectl delete -f test.yaml
    ==> 삭제 시 yaml파일의 이름을 보고 따라가기 때문에 이름이 다르면 delete가 정상적으로 안됨

    -- 전체 확인
    kubectl get pods -n group1-team6  #pod 확인. 약어 po
    kubectl get service -n group1-team6  #service 확인. 약어 svc
    kubectl get deployment -n group1-team6  #deployment 확인. 약어 deploy
    kubectl get persistentvolume -n group1-team6  #persistentvolume 확인. 약어 pv
    kubectl get persistentvolumeclaim -n group1-team6  #persistentvolumeclaim 확인. 약어 pvc
    kubectl -n group1-team6 get all -o wide

    -- kubernets 명령어 전체 확인
    kubectl api-resources

docker image 생성 및 private-repository 추가
    -- 이미지 생성
    docker build -t k8s-vga-worker1:5000/group1-team6-edu01 .

    -- 외부 private-repository 로그인
    docker login k8s-vga-worker1:5000
    ==> 계정과 PW로 로그인. 성공 시 Login Successded

    -- 이미지 업로드
    docker push k8s-vga-worker1:5000/group1-team6-edu01:latest

    -- 이미지 업로드 확인
    curl -X GET http://k8s-vga-worker1:5000/v2/_catalog
    ==> 업로드한 이미지 이름(group1-team6-edu01) 을 확인

외부에서 pod 접속 방법
    -- deployment
    labels.app: test001
    containerPort: 3306  #mysql port
    ==> container 에서 접속할 port 번호. 실제 서비스 port가 아님
    ==> 해당 port 번호로 service가 연결될 예정
