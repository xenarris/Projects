        //TODO: Set up a variable to hold the order total
       let total = 0;

        // TODO: Add EventListeners to each image element
        const imgList = document.getElementsByTagName('img');

        //use a loop to add event listeners mouseout - removeBorder
        //mouseover to call addBorder
        //clock to call placeOrder
        for (let img of imgList) 
        {
            img.addEventListener('mouseout', function(e) { removeBorder(e); });    
            img.addEventListener('mouseover', function(e) { addBorder(e); });    
            img.addEventListener('click', placeOrder);    
        }
       
        //alters the elements class name to add the CSS border styling
        function addBorder(e)
        {
            e.target.className = 'border';
          
        }
        //alters the elements class name to remove the CSS border styling.
        function removeBorder(e)
        {
            e.target.className = 'noBorder';
        }
        //TODO: Create a list item from the clicked image element and add it to the unordered list.
        //the total is also updated and displayed in the <h3> element.
        function placeOrder(e)
        {
            console.log("placed order " + e.target.alt);
            // text contains the alt text for  the image that was clicked
            let text = e.target.alt;
            
            //create a list item node
            let listItem = document.createElement('li');
          
            //put text into the node
            listItem.textContent = text;

            //very important append into the DOM
            let parentNode = document.getElementById('orders');
            parentNode.appendChild(listItem);

            //add a dollar to the total
            total++;
            //display the total on out page
            document.getElementById('total').textContent = "Total $" + total.toFixed(2);
        }
