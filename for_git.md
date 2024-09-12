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

## Usual problems

* Praneeth has created his branch ENG-1234 from dev on Thursday and he is working
* In the meanwhile, Swetha has merged her work with dev branch;
* So that means, Praneeth is working on codebase which is old
* What happens here is when Praneeth completes his work and raises a PR to merge to dev, it will show a **CONFLICT**
* The way to solve this is:
* As soon as Swetha's PR gets merged to dev branch, message everyone in the team saying **Guys! please rebase your dev**
* Praneeth has to save his work and run **git rebase** command before proceeding. So the conflicts, if any, will be resolved immediately

## To Do

* Create a repo (say ipl)
* Add a collaborator who can also contribute say Princy and Aishuwarya
* From dev branch create two branches princy-1234 and aish-1234
* Each one starts working with their branches; both are going to write a HelloWorld1.java and HelloWorld2.java
* Princy complete it first, raise a PR and merge it with dev; and ask Aishuwarya to rebase
* Aishuwarya needs to run rebase command and see Princy's code appearing as well
* Then raise a PR and merge it with dev

* Raise a PR from dev to qa
* Finally raise a PR from qa to main









