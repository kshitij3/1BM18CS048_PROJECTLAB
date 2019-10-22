#include<stdio.h>
#include<stdlib.h>
struct node
{
int data;
struct node* next;
};
typedef struct node * NODE;
NODE getnode()
{
NODE p;
p=(NODE)malloc(sizeof(struct node));
if(p!=NULL)
return p;
else
{
  printf("\nMemory not allocated");
  exit(0);
 }}
 NODE insert(NODE head,int ele)
 {
 NODE p;
 p=getnode();
 p->data=ele;
 p->next=head;
 head=p;
 }
 NODE sort(NODE head)
 {
 int temp;
 NODE p,q;
 if(head==NULL)
 {
 printf("\nEMPTY!!!");
 return head;
 }
 while(p->next!=NULL)
 {
 q=p->next;
 while(q!=NULL)
 {
  if(p->data>q->data)
  {
  temp=p->data;
  p->data=q->data;
  q->data=temp;
  }
  q=q->next;
  }
  p=p->next;
  }
  return head;
  }
  NODE reverse(NODE head)
  {
  NODE curr=head,prev=NULL,nextn=NULL;
  if(head==NULL)
  {
  printf("\nEMPTY!!!");
 return head;
 }
 if(head->next==NULL)
 return head;
 while(curr!=NULL)
 {
 nextn=curr->next;
 curr->next=prev;
 prev=curr;
 curr=nextn;
 }
 head=prev;
 return head;
 }
 NODE conc(NODE head,NODE head1)
 {
 if(head==NULL)
 {
 return head1;
 }
 if(head1==NULL)
 return head;
 NODE p=head,q=head1;
 while(p->next!=NULL)
 p=p->next;
 p->next=q;
 return head;
 }
 
 void display(NODE head)
 {
 if(head==NULL)
 {
 printf("\nEMPTY!!!");
 }
 else
 {
 NODE p;
 p=head;
 printf("\nELEMENTS are ");
 while(p!=NULL)
 {
 printf("%d\n",p->data);
 p=p->next;
 }}
 return;
 }
int main()
{
int ch,ele,size;
NODE head=NULL,head1=NULL;

while(1)
{
printf("\nENTER your choice");
printf("\n1.INSERT\n2.SORT\n3.REVERSE\n4.CONCATINATE\n5.DISPLAY\n6.EXIT");
printf("----------------------------------------------------------------------------------------------------------------------");
scanf("%d",&ch);

switch(ch)
{
case 1:printf("\nENTER element to be inserted");
        scanf("%d",&ele); 
        head=insert(head,ele);
        break;
 case 2:head=sort(head);
         printf("\nLinked list sorted succesfully");
         break;
 case 3:head=reverse(head);
        printf("\nLInked list reversed succesfully");
        break;
 case 4:printf("\nSize of adding linked list");
        scanf("%d",&size);
        printf("\nEnter elements");
        for(int i=0;i<size;i++)
        {
          head1=insert(head,ele); 
          }   
          head=conc(head,head1);                
           printf("\nLiked list concatinated succesfully");
        break;
  case 5:display(head);
         break;
  case 6:exit(0);
  default:printf("\nWrong choice");
  }
  }
  return(0);
  }
  
                     
  
  
  
  
  

