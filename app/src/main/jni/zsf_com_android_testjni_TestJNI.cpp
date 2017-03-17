#include <stdio.h>
#include "zsf_com_android_testjni_TestJNI.h"
#include "Add.h"

CAdd *pCAdd = NULL;

JNIEXPORT jboolean JNICALL Java_zsf_com_android_testjni_TestJNI_Init(JNIEnv *env, jobject obj){
if(pCAdd == NULL){
pCAdd = new CAdd;
}
return pCAdd !=NULL;
}

JNIEXPORT jint JNICALL Java_zsf_com_android_testjni_TestJNI_Add(JNIEnv *env, jobject obj, jint x ,jint y){
int res = -1;
if(pCAdd != NULL){
res = pCAdd->Add(x,y);
}
return res;
}

JNIEXPORT void JNICALL Java_zsf_com_android_testjni_TestJNI_Destroy(JNIEnv *env, jobject obj){
if(pCAdd != NULL){
delete pCAdd;
pCAdd = NULL;
}
}