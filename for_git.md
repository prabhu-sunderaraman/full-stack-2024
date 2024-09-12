# say you have repo which is your project (**ipl**)
# initially there are main, dev, qa branches

### Developer: Praneeth
* **ToDo**: Create a file upload endpoint (say issue is **ENG-1234**)
* clone the repository to your local machine
* Switch to dev branch
* create a new branch from dev say **ENG-1234** **git checkout -b ENG-1234**
* Write all the code
* Use **git add**, **git status**, **git restore --staged**, **git commit**
* Do a **git push**
* If ENG-1234 branch is already present in remote **git push** is enough
* If it's not present **git push --set-upstream ...**
* After development is complete raise a PR (**Pull Request**)
* After review, PR will be merged to dev and qa
* Finally qa will be merged to main branch (with a versioning and tags)
