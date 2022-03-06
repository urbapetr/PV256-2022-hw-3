# Homework 3

1. Follow instructions in [wiki](https://gitlab.fi.muni.cz/grp-pv256/wiki/wikis/home)
and proceed with forking this repo
2. In `MainActivity::onCreate` implement onClickListeners for Buttons
3. Implement counter using TextView and the field `count`
   * don't use TextView for persisting state of the count value
4. Make sure the counter survives orientation changes (its value won't reset or change on screen rotation)
5. Submit changes into a **submit** branch and push it to your forked repo
6. Create a merge request against _your_ master branch and assign it to **xsevci11**, **ext-stefan.krajanec**, **xpanek1**, **xmasa**

Your commit must pass Gitlab CI verification. To test this locally, run:
```
./gradlew check
```
