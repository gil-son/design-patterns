## Mediator Pattern

The effectiveness in communication is crucial for the success of any system. When creating an environment where various entities interact, as in the digital universe, the challenge is to maintain clear, efficient, and scalable communication.

<div align="">
  <img src="https://thumbs2.imgbox.com/6a/78/xZDbX04q_t.png" />
</div>

The Mediator Pattern is an intelligent solution to optimize the interaction between entities in a complex system.

<hr/>


The Mediator acts as a central coordination point, allowing for the decoupling of individual components.
<div align="">
  <img src="https://thumbs2.imgbox.com/84/78/5QXFflNP_t.png" />
</div>
 This means that changes to one component do not directly affect others, resulting in a more flexible system less prone to unexpected errors.
<hr/>

Changes to one component can be made without directly affecting others, simplifying maintenance.
<div align="">
  <img src="https://thumbs2.imgbox.com/28/8e/fRP1PWgU_t.png" />
</div>
<hr/>

As a system grows, scalability becomes a primary concern. The Mediator excels in facilitating the addition of new components, as they simply need to understand how to communicate with the mediator, without the need to alter existing communication logic.
<div align="">
  <img src="https://thumbs2.imgbox.com/02/13/3iEWiRd5_t.png" />
</div>
<hr/>



### General Benefits:

<b>Decoupling:</b> The Mediator helps reduce coupling between components, making the system more flexible and easy to maintain.

<b>Simplified Maintenance:</b> Changes to one component can be made without directly affecting others, simplifying maintenance.

<b>Scalability:</b> Adding new components to the system is easier, as they only need to understand how to communicate with the Mediator.

<b>Communication Organization:</b> The Mediator provides an organized way to handle communication between different parts of the system, promoting a clearer architecture.

Therefore, the Mediator pattern is a versatile tool that can be applied to various layers of an application to improve the structure, maintenance, and scalability of the system.


### Example

#### Diagram

<div align="">
  <img src="https://thumbs2.imgbox.com/ab/c8/yAsVX4Tp_t.png" />
</div>
<hr/>

#### Result of code
<div align="">
  <img src="https://thumbs2.imgbox.com/55/1b/PPHBm3hS_t.png" />
</div>
