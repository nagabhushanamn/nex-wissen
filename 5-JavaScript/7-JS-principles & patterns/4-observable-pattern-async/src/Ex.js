const Events = {
    events: {},
    subscribe: (eventName, object, callback) => {
        Events.events[eventName] = Events.events[eventName] || [];
        Events.events[eventName].push({ object, callback });
    },

    unsubscribe: (eventName, object) => {
        if (Events.events[eventName]) {
            for (let i = 0; i < this.events[eventName].length; i++) {
                if (Events.events[eventName][i].object === object) {
                    Events.events[eventName].splice(i, 1);
                    break;
                }
            }
        }
    },
    publish: (eventName, data) => {
        if (Events.events[eventName]) {
            Events.events[eventName].forEach((instance) => {
                instance.callback(data);
            });
        }
    }
}